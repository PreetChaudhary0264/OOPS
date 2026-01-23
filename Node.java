import java.util.Objects;

public class Node<X,Y> {
    X x;
    Y y;

    Node(X x,Y y){
        this.x = x;
        this.y = y;
    }
    public boolean equals(Object obj){
        if(!(obj instanceof Node))return false;
        Node<?,?> n = (Node<?,?>)obj;
        return x == n.x && y == n.y;
    }
    public int hashCode(){
        return Objects.hash(x,y);
    }
}
