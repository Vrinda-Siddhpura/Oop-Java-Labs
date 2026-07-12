interface EventListener{
    void performEvent();
}

interface MouseListener extends EventListener{
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}

interface KeyListener extends EventListener{
    void keyPressed();
    void keyReleased();
}

class EventDemo implements MouseListener, KeyListener{
    public void performEvent(){
        System.out.println("Event performed.");    
    }

    public void mouseClicked(){
        System.out.println("Mouse clicked.");    
    }

    public void mousePressed(){
        System.out.println("Mouse pressed.");    
    }

    public void mouseReleased(){
        System.out.println("Mouse released.");    
    }

    public void mouseMoved(){
        System.out.println("Mouse moved.");    
    }

    public void mouseDragged(){
        System.out.println("Mouse dragged.");    
    }

    public void keyPressed(){
        System.out.println("Key pressed.");    
    }

    public void keyReleased(){
        System.out.println("Key released.");    
    }
}

public class P2{
    public static void main(String []args){
        EventDemo e = new EventDemo();

        e.performEvent();
        e.mouseClicked();
        e.mousePressed();
        e.mouseReleased();
        e.mouseMoved();
        e.mouseDragged();
        e.keyPressed();
        e.keyReleased();
    }
}