package src.day18_nestedLoops;

public class do_while_Practice {
    public static void main(String[] args) {
        int num = 0;

        do{
            if (num % 2 !=0) {
            System.out.print(num+ " ");

            }
            num ++;
        } while ((num <101));

        System.out.println();
        System.out.println("================");
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
        System.out.println("================");
        int z =1;
        do {
            System.out.println(z);
            if (z == 3){
                break;
            }
            z++;
        }while (z <= 5);

        System.out.println("================");
        int y =1;
        do {
            if (y == 3){
                y++;
                continue;
            }
            System.out.println(y);
            y++;
        }while (y <= 5);

        System.out.println("================");
        int t =1;
        do {
                if (t % 2 !=0) {
                    t++; // to make sure the iterator is not skipping
                    continue;
                }
            System.out.print(t+ " ");
            t++;
        }while (t <= 100);

    }

}
