package week1;

public class LibraryItem {
    String title; //제목
    String type; //형태 (책,DVD)
    String category; //문학 영문 예술


    boolean available; //이용가능여부

    void availableItem() {
        available = false;
        System.out.println(">> [" + title + "] << 대여가 완료되었습니다. \n");
        }
     void returnItem() {
        available = true;
         System.out.println(">> [" + title + "] << 반납이 완료되었습니다.이용감사합니다. \n" );
    }
}



