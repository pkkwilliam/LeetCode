package leetcode;

import java.util.*;

public class ReconstructItinerary {
    public static void main(String[]args){
        String[][][] input = {
                {{"JFK", "SFO"}, {"JFK", "ATL"}, {"SFO", "ATL"}, {"ATL", "JFK"}, {"ATL", "SFO"}},
                {{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}}
        };
        for(String[][] s : input)
            for(String r : new Solution332().findItinerary(s))
                System.out.println(r+" ");
    }
}
class Solution332 {
    public List<String> findItinerary(String[][] tickets) {
        Map<String,LinkedList<String>> map = new HashMap<>();
        // Add all tickets into map
        for(String[] ticket : tickets){
            String from = ticket[0], to = ticket[1];
            if(map.containsKey(from)){
                map.get(from).add(to);
            }else{
                map.put(from,new LinkedList<>());
                map.get(from).add(to);
            }
        }
        // Sort all location base on lexical order
        Set<String> keys = map.keySet();
        for(String s : keys){
            List<String> list = map.get(s);
            Collections.sort(list);
        }
        // Trip Start
        List<String> result = new ArrayList<>();
        String fromCity = "JFK";
        while(fromCity != null){
            result.add(fromCity);
            LinkedList<String> temp = (map.containsKey(fromCity)) ? map.get(fromCity) :null;
            if(temp == null)
                break;
            fromCity = temp.poll();
        }
        return result;
    }
}