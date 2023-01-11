public class Set {
    private int[] allSets;
    private int counter;

    public Set(int num){
        allSets = new int[num];
        counter = 0;
    }
    public boolean add(int a){
        if(counter == allSets.length){
            return false;
        }
        for(int i=0;i<counter;i++){
            if(allSets[i]==a){
                return false;
            }
        }

        allSets[counter++]=a;
        return true;
        
    }
    public int find(int a){
        for(int i=0;i<counter;i++){
            if(allSets[i]==a){
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty(){
        if(counter == 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(counter==allSets.length){
            return true;
        }
        return false;
    }

    public boolean remove(int a){
        if(find(a)!=-1){
            for(int i=find(a);i<counter-1;i++){
                allSets[i] = allSets[i+1];
            }
            counter--;
            return true;
        }
        return false;
    }

    public void show(){
        System.out.print("(");
        for(int i=0;i<counter;i++){
            System.out.print(allSets[i]);
            if(i<counter-1){
                System.out.print(",");
            }
        }
        System.out.print(")");
    }
}
