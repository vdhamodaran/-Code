import java.io.*;
import java.util.*;

class findRoutes{
  static boolean isRoute(Map<String, LinkedHashSet<String>> map,String start,String end){
    if(map.get(start)==null) return false;
    ArrayList visited = new ArrayList();
    visited.add(start);
    for(String key : map.keySet()){      
      visited.add(key);
      if(visited.contains(end)){
        return true;
      }
      visited.addAll(search(map,visited,key));
    }
    return false;
  }
  static ArrayList search(Map<String, LinkedHashSet<String>> map,ArrayList visited,String node){
    for(String key : map.get(node)){
      visited.add(key);
    }
    return visited;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Map<String, LinkedHashSet<String>> map = new HashMap();
    String[] list = {"A->B","A->C","B->D","C->D","D->E","E->F"};
    for(int i =0;i<list.length;i++){
      String[] temp = list[i].split("->");
      LinkedHashSet<String> adjacent = map.get(temp[0]);
      if(adjacent==null) {
          adjacent = new LinkedHashSet();
          map.put(temp[0], adjacent);
      }
      adjacent.add(temp[1]);
    }
    for(String key : map.keySet()){
      System.out.println(key.toString()+"->"+map.get(key).toString());
    }
    String route = in.nextLine();
    String[] temp = route.split(",");
    System.out.println(isRoute(map,temp[0],temp[1]));;
  }
}
