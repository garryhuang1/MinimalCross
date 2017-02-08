/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimalcross;

import java.util.ArrayList;

/**
 *
 * @author Garry Huang
 */
public class MinimalCross {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node p1 = new Node(1, 0 , 0); //Point 1, layer 0, position
        Node p2 = new Node(2, 0 , 1);
        Node p3 = new Node(3, 0 , 2);
        Node p4 = new Node(4, 1 , 0);
        Node p5 = new Node(5, 1, 1);
        Node p6 = new Node(6, 1, 2);
        Edge e1 = new Edge(p1, p5);
        Edge e2 = new Edge(p2, p6);
        Edge e3 = new Edge(p2, p4);
        Edge e4 = new Edge(p3, p4);
        Edge e5 = new Edge(p3, p5);
        
        
        ArrayList<Node> nodes = new ArrayList<Node>();
        nodes.add(p1);
        nodes.add(p2);
        nodes.add(p3);
        nodes.add(p4);
        System.out.println(crossing(e1, e2)); //false
        System.out.println(crossing(e1, e3)); //true
        System.out.println(crossing(e1, e4)); //true
        System.out.println(crossing(e1, e5)); //false
        System.out.println(crossing(e2, e3)); //false
        System.out.println(crossing(e2, e4)); //true
        System.out.println(crossing(e2, e5)); //true
        System.out.println(crossing(e3, e4)); //false
        System.out.println(crossing(e3, e5)); //false
        System.out.println(crossing(e4, e5)); //false
        
    }
    public static Boolean checkIfCrossing(ArrayList<Node> nodes){
        boolean isCrossing = false;
        for(Node a : nodes){
            ArrayList<Edge> edges = a.getEdges();
            System.out.println("NODE: " + a.getNodeNumber());
            System.out.println("LAYER: " + a.getLayer());
            System.out.println("POSITION: " + a.getPosition());
            for(Edge b : edges){       
                System.out.println("EDGE: " + b.node1.getNodeNumber() +" " + b.node2.getNodeNumber());
            }
            System.out.println();
        }
        return isCrossing;
    }
    public static Boolean crossing(Edge Edge1, Edge Edge2){
        boolean isCrossing = false;
        float x1 = Edge1.node1.getPosition(); //X1
        float y1 = Edge1.node1.getLayer(); //Y1
        float x2 = Edge1.node2.getPosition(); //X2
        float y2 = Edge1.node2.getLayer(); //Y2
        
        float x3 = Edge2.node1.getPosition(); //X3
        float y3 = Edge2.node1.getLayer(); //Y3
        float x4 = Edge2.node2.getPosition(); //X4
        float y4 = Edge2.node2.getLayer(); //Y4
        
        float adx = x2 - x1;
        float ady = y2 - y1;
        float bdx = x4 - x3;
        float bdy = y4 - y3;
        float s = (-adx * (x1-x3) + adx * (y1 - y3))/(-bdx * ady + adx + bdy);
        float t = (+bdx * (y1 - y3) - bdy * (x1-x3))/(-bdx * ady + adx * bdy);
        //System.out.println("S: " + s);
        //System.out.println("T: " + t);
        return(s > 0 && s < 1 && t > 0 && t <1);
        
    }
    
}
