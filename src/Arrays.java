public class Arrays {

    public int[] nums;

    public static void main(String[] args) {
        System.out.println("welcome to the world of arrays");
        new Arrays();



    }

    public Arrays(){
        nums=new int[10];
        for(int y=0;y<nums.length;y=y+1){
            nums[y]=(int)(Math.random()*100)+1;
        }
        displayArray();
        sumArray();


    }
    public void displayArray(){
        for(int x=0;x<nums.length;x=x+1){
            System.out.println(x+": "+nums[x]);
        }
    }
    public void sumArray(){
        int a=0;
        for(int z=0;z< nums.length;z=z+1){
            a=a+nums[z];
        }
        System.out.println(a);
    }
}

