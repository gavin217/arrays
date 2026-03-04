public class Arrays {

    public int[] nums;
    public star[] stars;

    public static void main(String[] args) {
        System.out.println("welcome to the world of arrays");
        new Arrays();



    }

    public Arrays(){
        nums=new int[10];
        stars=new star[7];
        stars[0]=new star();
        for (int x=0;x<stars.length;x=x+1){
            stars[x]=new star();
            stars[x].points=(int)(Math.random()*10);
        }
        star s1=new star();
        s1.printInfo();
        stars[0].printInfo();
        s1.color="red";
        s1.points=7;
        s1.printInfo();
        stars[0].color="blue";
        stars[0].points=11;
        stars[0].printInfo();
        System.out.println(stars[2].points);

        for(int y=0;y<nums.length;y=y+1){
            nums[y]=(int)(Math.random()*100)+1;
        }
        displayArray();
        sumArray();
        aveArray();
        maxArray();
        minArray();
        maxIndex();
        greaterThan50();
        displayStars();
        addStars();


    }
    public void displayArray(){
        for(int x=0;x<nums.length;x=x+1){
            System.out.println(x+": "+nums[x]);
        }
    }
    public void sumArray(){
        double a=0;
        for(int z=0;z< nums.length;z=z+1){
            a=a+nums[z];
        }
        System.out.println(a);
    }
    public void aveArray(){
        double b=0;
        for(int z=0;z< nums.length;z=z+1){
            b=b+nums[z];
        }
        b=b/nums.length;
        System.out.println(b);
    }
    public void maxArray(){
        int c=0;
        for(int z=0;z< nums.length;z=z+1){
            c=Math.max(c,nums[z]);
        }
        System.out.println(c);
    }
    public void minArray(){
        int c=100;
        for(int z=0;z< nums.length;z=z+1){
            c=Math.min(c,nums[z]);
        }
        System.out.println(c);
    }
    public void maxIndex(){
        int c=0;
        int index=0;
        for(int z=0;z< nums.length;z=z+1){
            if (nums[z]>c){
                c=nums[z];
                index=z;
            }

        }
        System.out.println(index);
    }
    public void greaterThan50(){
        int index=0;
        for(int z=0;z< nums.length;z=z+1){
            if (nums[z]>50){
                index=index+1;
            }

        }
        System.out.println(index);
    }
    public void displayStars(){
        for (int z=0;z< stars.length;z=z+1){
            stars[z].printInfo();
        }
    }
    public void addStars(){
        double a=0;
        for(int z=0;z< stars.length;z=z+1){
            a=a+stars[z].points;
        }
        System.out.println(a);
    }
}

