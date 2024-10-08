import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Member[] members = new Member[n];
        for (int i = 0; i < n; i++) {
            members[i] = new Member();
            members[i].age = sc.nextInt();
            members[i].name = sc.next();
        }

        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return o1.age - o2.age;
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(members[i].age + " " + members[i].name);
        }
    }
}

class Member {

    int age;
    String name;
}