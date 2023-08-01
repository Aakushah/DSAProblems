class Stack_{
    int capacity;
    int top;
    int arr[];

    Stack_(int capacity){
        this.top=-1;
        this.capacity=capacity;
        arr=new int[capacity];
        

    }
    boolean isEmpty(){

        if(top == -1) return true;
        else return false;
    }

    void push(int data){
        if(top >= capacity-1){
            System.out.println("stack is overflow");
            return;
        }
        else{
            
            top++;
            arr[top]=data;
        }
    }

    int pop(){
        if(top == -1){
            System.out.println("stack is empty");
            return -1;

        }
        int element=arr[top];

        top--;
        
        return element;

    }

    int peek(){
        if( top == -1){
            System.out.println("stack is empty");
        }
        return arr[top];
    }

    void display(){  
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
    }


}

public class StackArrayImplementation {
    public static void main(String[] args) {
        Stack_ s1=new Stack_(5);
        s1.push(3);
        s1.push(13);
        s1.push(23);
        s1.push(33);
        s1.push(43);
        s1.push(43);
        s1.display();


        
    }
    
}
