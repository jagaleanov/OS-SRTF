/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesossrtf;

/**
 *
 * @author jgale
 */
public class Node {

    private Node next;
    private int id;
    private int timeIn;         //tiempo llegada
    private int raf;            //ráfaga
    private int timeStart;      //tiempo Comienzo
    private int timeEnd;        //tiempo Final
    private int timeReturn;        //tiempo Retorno
    private int timeWait;           //Tiempo espera
    private int rafExecuted;   //Rafaga procesada
    private String status;   //estados "Ready","OnProcess","Blocked","Done"

    public Node(int id, int timeIn, int raf) {

        this.id = id;
        this.next = null;
        this.timeIn = timeIn;
        this.raf = raf;
        this.timeStart = 0;
        this.timeEnd = 0;
        this.timeReturn = 0;
        this.timeWait = 0;
        this.rafExecuted = 0;
        this.status = "Ready";
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(int timeIn) {
        this.timeIn = timeIn;
    }

    public int getRaf() {
        return raf;
    }

    public void setRaf(int raf) {
        this.raf = raf;
    }

    public int getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(int timeStart) {
        this.timeStart = timeStart;
    }

    public int getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(int timeEnd) {
        this.timeEnd = timeEnd;
    }

    public int getTimeReturn() {
        return timeReturn;
    }

    public void setTimeReturn(int timeRet) {
        this.timeReturn = timeRet;
    }

    public int getTimeWait() {
        return timeWait;
    }

    public void setTimeWait(int timeWait) {
        this.timeWait = timeWait;
    }

    public int getRafExecuted() {
        return rafExecuted;
    }

    public void setRafExecuted(int rafExecuted) {
        this.rafExecuted = rafExecuted;
    }

    public void sumRafExecuted() {
        this.rafExecuted++;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public Node clone() {

        Node newNode = new Node(this.id, this.timeIn, this.raf);

        newNode.setId(this.id);
        newNode.setNext(null);
        newNode.setTimeIn(this.timeIn);
        newNode.setRaf(this.raf);
        newNode.setTimeStart(this.timeStart);
        newNode.setTimeEnd(this.timeEnd);
        newNode.setTimeReturn(this.timeReturn);
        newNode.setTimeWait(this.timeWait);
        newNode.setRafExecuted(this.rafExecuted);
        newNode.setStatus(this.status);
        //newNode.setChar(this.actualChar);
        
        return newNode;
    }
}
