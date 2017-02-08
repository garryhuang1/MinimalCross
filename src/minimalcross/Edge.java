/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimalcross;

/**
 *
 * @author Garry Huang
 */
public class Edge {
    public Node node1;
    public Node node2;
    public Edge(Node node1, Node node2){
        this.node1 = node1;
        this.node2 = node2;
    }
}
