package Rectangle;

public class Rectangle implements Comparable, ComparableArea {
    private int width, length;
    
    public Rectangle (){
        width = 0;
        length = 0;
    }
    
    public Rectangle(int w, int l){
        width = w;
        length = l;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getLength(){
        return length;
    }
    
    public int getArea(){
        return width * length;
    }
    
    public String toString(){
        String rect;
        
        rect = "Rectangle has width of " + width + ", length of " + length + ", area of " + width * length;
        return (rect);
    }
    
    public int compareTo(Object obj){
        Rectangle testRect = (Rectangle)obj;
        
        if (width < testRect.getWidth() && length < testRect.getLength()){
            return(-1);
        } else if(width == testRect.getWidth() && length == testRect.getLength()){
            return (0);
        } else {
            return(1);
        }
    }
    
    public int compareToArea(Object obj){
        Rectangle testArea = (Rectangle)obj;
        
        if (width * length < testArea.getArea()){
            return -1;
        } else if (width * length == testArea.getArea()){
            return 0;
        } else {
            return 1;
        }
    }
    
    public static void main(String[] args) {
        
        Rectangle rect1 = new Rectangle(5,6);
        Rectangle rect2 = new Rectangle(5,6);

        System.out.println(rect1);
        System.out.println(rect2);
        
        if(rect1.compareTo(rect2) == 0){
            System.out.println("Objects are equal.");
        } else if (rect1.compareTo(rect2) < 0){
            System.out.println("Rect1 is smaller than Rect2.");
        } else{
            System.out.println("Rect1 is larger than Rect2.");
        }
        
        if (rect1.compareToArea(rect2) == 0){
            System.out.println("Objects have same area.");
        } else{
            System.out.println("Objects have different area.");
        }
        
    }

    
}

