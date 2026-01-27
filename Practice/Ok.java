package Practice;

import java.util.Objects;

public class Ok {
    int x;
    int y;
    int z;

    Ok(){

    }
    @Override
    public boolean equals(Object o){
        if(!(o instanceof Ok))return false;
        Ok n = (Ok) o;
        return x == n.x && y == n.y;
    }
    @Override
    public int hashCode(){
        return Objects.hash(x,y,z);
    }
}
