import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static class StudentInfo {
        int grade;
        int gender;

        public StudentInfo(int grade, int gender) {
            this.grade = grade;
            this.gender = gender;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int allStudent = Integer.parseInt(st.nextToken());
        int roomLimit = Integer.parseInt(st.nextToken());

        // gender W=0, M=1
        List<StudentInfo> mList = new ArrayList<>();
        for (int i = 0; i < allStudent; i++) {
            st = new StringTokenizer(br.readLine());

            int gender = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());

            mList.add(new StudentInfo(grade, gender));
        }

        Iterator<StudentInfo> mIterator = mList.iterator();
        List<StudentInfo> wList = new ArrayList<>();
        while (mIterator.hasNext()) {
            StudentInfo studentInfo = mIterator.next();
            if (studentInfo.gender == 0) {
                wList.add(studentInfo);
                mIterator.remove();
            }
        }

        Map<Integer, Integer> mMap = new HashMap<>();
        Map<Integer, Integer> wMap = new HashMap<>();

        for (StudentInfo info : mList) {
            mMap.put(info.grade, mMap.getOrDefault(info.grade, 0) + 1);
        }

        for (StudentInfo info : wList) {
            wMap.put(info.grade, wMap.getOrDefault(info.grade, 0) + 1);
        }

        int roomCnt = 0;
        for (Map.Entry<Integer, Integer> entry : mMap.entrySet()) {
            roomCnt += (entry.getValue() + roomLimit - 1) / roomLimit;
        }

        for (Map.Entry<Integer, Integer> entry : wMap.entrySet()) {
            roomCnt += (entry.getValue() + roomLimit - 1) / roomLimit;
        }

        System.out.println(roomCnt);
    }
}
