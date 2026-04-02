package JAVA;

import java.util.Scanner;

public class week1 {
    public static void main(String[] args) {
        int number;
        String name;
        Scanner in = new Scanner(System.in);
        
        System.out.println("저장할 아기사자 수를 5 이상 입력해주세요.");

        while (true) {
            number = in.nextInt();
            if(number<5){
                System.out.println("[오류] 5 이상 입력해주세요.");
                System.out.println("저장할 아기사자 수를 5 이상 입력해주세요.");
            }
            else{
                break;
            }    
        }
        
        String[] member = new String[number];
        System.out.println("아기사자 이름을 입력해주세요.");
        
        for(int i=0; i<number; i++){
            name = in.next();
            member[i] = name;
        }

        
        System.out.println("아기사자 명단을 최종적으로 출력합니다.");
        
        for(int j=0; j<member.length; j++){
            System.out.printf("%d. %s\n", j+1, member[j]);
        }

        in.close();
    }
    
}