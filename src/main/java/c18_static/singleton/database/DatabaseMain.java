package c18_static.singleton.databases;

public class DatabaseMain {
    public static void main(String[] args) {
        // DataConnection 객체는 여기서 만들지 않습니다.
        // 그 이유는 뭘까요? -> DataManager.java에 DatabaseConnection 객체를 하나 만들어 내는
        // 코드를 작성해 넣었기 때문에 굳이 반복하지 않습니다. (어차피 싱글톤 패턴이기도 하구요)
        DataManager dataManager1 =new DataManager();

        //dataManager1의 메서드 실행
        dataManager1.performDatabaseOperations();
        /*
            dataManager1.performDatabaseOperations();의 실행 결과

            데이터베이스를 연결하였습니다.
            데이터베이스 연산을 수행 중
            데이터베이스 연결을 끊었습니다.
         */
        //dataManager2 객체 생성 하시고 perfromDatabaseOperations()이거 실행시킨 결과를
        //콘솔 창에 띄워두세요.
        DataManager dataManager2 = new DataManager();
        dataManager2.performDatabaseOperations();
        /*
            결과값
            데이터베이스 연산을 수행 중
            데이터베이스 연결을 끊었습니다.

            이유는?
            dataManager1을 생성했을 때 DataConnection의 객체를 만들게 되는데, 이떄 싱글톤으로 작성
            했기 때문에 dataManager2 객체를 생성한다고 하더라도 기존의 DataConnection 객체를 사용함.
            그 결과 DatabaseConnection의 생성자는 한 번만 호출됨

            그래서 dataManager1의 메서드 실행 결과와
            dataManager2의 메서드 실행 결과기 차이가 나게 됩니다.
         */




    }
}