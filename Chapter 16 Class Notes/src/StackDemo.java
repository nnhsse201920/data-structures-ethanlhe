public class StackDemo
{
    public static void main(String[] args) {

        LinkedListStack stack = new LinkedListStack();
        stack.push("Tom");
        stack.push("Romeo");
        stack.push("Harry");
        stack.push("Diana");

        while (!stack.empty())
        {
            System.out.println(stack.pop());
        }

        System.out.println("Expected: Tom Romeo Harry Diana");
    }
}
