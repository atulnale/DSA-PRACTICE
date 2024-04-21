package problem146;


import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination) return true;
        boolean[] visited = new boolean[n];
        ArrayList<Integer>[] nodes = new ArrayList[n];
        for(int i = 0; i< nodes.length; i++) {
            nodes[i] = new ArrayList<>();
        }
        for(int i = 0; i< edges.length; i++) {
            nodes[edges[i][0]].add(edges[i][1]);
            nodes[edges[i][1]].add(edges[i][0]);
        }
        Stack<Integer> stack = new Stack<>();
        stack.add(source);
        return checkPath(destination, nodes, stack, visited);
    }

    private boolean checkPath(int destination, ArrayList<Integer>[] nodes, Stack<Integer> stack, boolean[] visited) {
        if(stack.size() == 0) return false;
        int src = stack.pop();
        boolean result = false;
        visited[src] = true;
        for(int dest: nodes[src]) {
            if(dest == destination){
                result = true;
                break;
            }
            if(!visited[dest]) {
                stack.add(dest);
            }
        }
        return result || checkPath(destination, nodes, stack, visited);
    }
}