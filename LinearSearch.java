public class LinearSearch {

    public static int Linear_Search(int nums[],int key){

        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                return i; 
            }
        }
        return -1;
    }

    public static int Menu(String menu[], String item){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==item){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[]= {2,4,6,8,10,12,14,16};
        int key=10;
        String menu[]={"Dosa","Pizza","Burger","Samosa","Chaat"};
        String item="Samosa";
        

        int index=Linear_Search(nums,key);
        if (index==-1){
            System.err.println("NOT FOUND");
        }else{
            System.out.println("Key is found at index :  "+index+"  "+nums[Linear_Search(nums, key)]);
        }

        System.out.println("Item is found at index : "+Menu(menu, item)+"  "+menu[Menu(menu, item)]);

    }
}
