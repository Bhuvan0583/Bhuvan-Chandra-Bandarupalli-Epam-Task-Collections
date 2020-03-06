
import java.util.*;

public class mycollection_bhuvan {
    static class Data {
        int number;

        Data(int number) {
            this.number = number;
        }
    }

    public static void main(String args[]) {
        mycollection_bhuvan ob = new mycollection_bhuvan();
        int a[] ={20,30,40,50,3,4,5,2,1,9};
        ArrayList<Data> list = new ArrayList<Data>();
        for(int i=0;i<10;i++)
        {
            list.add(new Data(a[i]));
        }
        Scanner s = new Scanner(System.in);
        boolean x = true;
        while (true) {
            System.out.println("Enter your choice\n 1.Add Element to List\n 2.Remove Element in list\n 3.Display the list");
            int n = s.nextInt();
            if (n == 1) {
                System.out.println("Enter The Element to be inserted");
                int n1 = s.nextInt();
                ob.AddElement(n1,list);
            }
            else if (n == 2) {
                System.out.println("Enter The index of element to be removed");
                int n1 = s.nextInt();
            ob.RemoveElement(n1,list);
            }
            else if (n == 3) {
              ob.DisplayList(list);
            }
            else {
                System.out.println("You have Entered a Invalid Option");
                break;
            }
        }
    }
    public void AddElement(int a,ArrayList<Data> list) {
        list.add(new Data(a));
    }

    public void RemoveElement(int a, ArrayList<Data> list) {
        list.remove(a);
    }

    public void DisplayList(ArrayList<Data> list) {
        Iterator<Data> a = list.iterator();
        while (a.hasNext()) {
            System.out.println(a.next().number);
        }

    }
}