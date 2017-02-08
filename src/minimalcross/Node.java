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
public class Node {
    private int nodeNumber;
    private int layer;
    private int position;
    private ArrayList<Edge> edge;
    public Node(int nodeNumber, int layer, int position){
        this.nodeNumber = nodeNumber;
        this.layer = layer;
        edge = new ArrayList<Edge>();
        this.position = position;
    }
    public void setPosition(int position){
        this.position = position;
    }
    public int getPosition(){
        return this.position;
    }
    public void setLayer(int layer){
        this.layer = layer;
    }
    public int getLayer(){
        return this.layer;
    }
    public void setNodeNumber(int nodeNumber){
        this.nodeNumber = nodeNumber;
    }
    public int getNodeNumber(){
        return this.nodeNumber;
    }
    public void addEdge(Edge newEdge){
        this.edge.add(newEdge);
    }
    public void removeEdge(Edge removeEdge){
        this.edge.remove(removeEdge);
    }
    public ArrayList<Edge> getEdges(){
        return this.edge;
    }
}
