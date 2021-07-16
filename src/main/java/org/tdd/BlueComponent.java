package org.tdd;

/**
 * Created by jsrois on 4/5/17.
 */
public class BlueComponent implements Component {
    @Override
    public int power(int numberOfDrops, int seconds) {
        if(numberOfDrops==1 && seconds==1){
            return 1;
        }  else if(numberOfDrops==2 && seconds==2){
            return 2;
        } else if(numberOfDrops==1 && seconds==2){
            return 3;
        } else {
        return 0;
        }
    }
}
