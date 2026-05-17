package week1;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         Book mybook = new Book("시나공 정보처리기사",
                 "도서",
                 "시험서",
                 true,
                 "공자",
                 "시나공"
         );

         DVD myDVD = new DVD();

         /*
          .변수 로 값을 바꾸는건 변수가 public 상태라서 변경이 가능한거고
          private 으로 잡으면 객체 안에서만 그 변수가 사용이 가능하다.
          */

         myDVD.title = "황제펭귄의 특성";
         myDVD.type = "DVD";
         myDVD.category = "자연";
         myDVD.director = "hawn";
         myDVD.playtime = 60;
         myDVD.available = false;

         //안내멘트
         System.out.println("***** hailey 도서관에 어서오십쇼~ ***** \n 이용을 원할 시 엔터 눌러주시길 바랍니다.");

         while (input.hasNextLine()) {
             System.out.println("******** 메인 메뉴 ********");
             System.out.println("번호를 입력해 주세요");
             System.out.println("1. 현재 목록 확인하기");
             System.out.println("0. 나가기");
             System.out.println("*************************");
             System.out.println("번호 입력 : ");

             int mainChoice = input.nextInt();


             if (mainChoice == 1) {
                 System.out.println("\n********* 현재 도서 목록 *********\n");
                 // 책목록 확인
                 if (mybook.available == true) {
//              System.out.println("\n 책목록 : \n [ -제목: " + mybook.title + " / - 형태: "+mybook.type+ " / - 분류: " +mybook.category+" / - 작가: "+mybook.author+ " / -출판사 : "+mybook.publisher+ " / - 대여가능여부 : " +mybook.available+"] \n");
                     System.out.println("대여가능 책 : 1번" + mybook);
                 } else {
                     System.out.println("대여불가   : 1번[" + mybook.title + "]은 지금 대여 불가합니다.\n");
                 }
                 // DVD 목록
                 if (myDVD.available == true) {
//              System.out.println("\n 책목록 : \n [ -제목: " + myDVD.title + " / - 형태: " + myDVD.type + " / - 분류: " + myDVD.category + " ");
                     System.out.println("대여가능 DVD : 2번" + myDVD);
                 } else {
                     System.out.println("대여불가 DVD : 2번[" + myDVD.title + "]은 지금 대여 불가합니다.\n");
                 }

                 System.out.println("\n원하시는 번호를 선택해 주세요.");
                 System.out.println("1. 대여하기");
                 System.out.println("2. 반납하기");
                 System.out.println("9. 뒤로 가기");
                 System.out.print("작업 번호 입력 : ");

                 int subChoice = input.nextInt();

                 // 1.대여하기
                 if (subChoice == 1) {
                     System.out.print("\n빌리고 싶은 자료의 번호를 입력하세요 : ");
                     int itemNum = input.nextInt();

                     if (itemNum == 1) {
                         if (mybook.available == true) {
                             mybook.availableItem();
                         } else {
                             System.out.println("이미 다른 분이 대여 중입니다.");
                         }
                     } else if (itemNum == 2) {
                         if (myDVD.available == true) {
                             myDVD.availableItem();
                         } else {
                             System.out.println("이미 다른 분이 대여 중입니다.");
                         }
                     } else {
                         System.out.println("목록에 없는 번호입니다.");
                     }
                 }

                 // 2.반납하기
                 else if (subChoice == 2) {
                     System.out.print("\n반납할 자료의 번호를 입력하세요 : ");
                     int itemNum = input.nextInt();

                     if (itemNum == 1) { if (mybook.available == true) {
                         System.out.println("대여 가능 상태입니다");
                     } else if (myDVD.available == false) {
                         mybook.returnItem();
                     }


                     } else if (itemNum == 2) { if (myDVD.available == true) {
                         System.out.println("대여 가능 상태입니다");
                     } else if (mybook.available == false) {
                        myDVD.returnItem();
                     }

                     } else {
                         System.out.println("목록에 없는 번호입니다.");
                     }



                 }

                 // 9번
                 else if (subChoice == 9) {
                     System.out.println("\n메인 화면으로 돌아갑니다.");
                 } else {
                     System.out.println("\n목록에 없는 번호입니다.");
                 }
             } else if (mainChoice == 0) {
                 System.out.println("\nhailey 도서관 이용을 종료합니다. 감사합니다!");
                 break;
             } else {
                 System.out.println("\n목록에 없는 번호입니다.");
             }
         }

         input.close();

     }
     }