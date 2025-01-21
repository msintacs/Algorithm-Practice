## 26307. Correct 

### 문제
Your best friend, Charlie, participated Taiwan Online Programming Contest (TOPC), which is a preliminary contest of the International Collegiate Programming Contest (ICPC).

According to the rules, teams are ranked according to the most problems solved. Teams who solve the same number of problems are ranked by the least total time. The total time is the sum of the time consumed for each solved problem. The time consumed for a solved problem is the time elapsed from the beginning of the contest to the submission of the correct answer plus 20 penalty minutes for every rejected code for that problem. There is no time consumed for a problem that is not solved.

Charlie’s team only solved one problem, and the correct answer was submitted at HH:MM AM. Fortunately, they did not submit any rejected code to the judge system. Please write a program to compute the time consumed for the problem solved by Charlie’s team. You may assume that TOPC started at 9:00 AM.

(해석)  

당신의 가장 친한 친구 Charlie는 국제 대학생 프로그래밍 대회(ICPC)의 예선전인 대만 온라인 프로그래밍 대회(TOPC)에 참가했습니다.

규칙에 따르면, 팀들은 가장 많은 문제를 해결한 순서대로 순위가 매겨지며, 같은 수의 문제를 해결한 팀들은 총 소요시간이 적은 순서대로 순위가 매겨집니다. 
총 소요시간은 각각 해결한 문제들의 소요시간의 합이며, 한 문제의 소요시간은 대회 시작부터 정답 제출까지의 시간에 그 문제에 대해 제출한 틀린 코드 하나당 20분의 페널티를 더한 것입니다. 
해결하지 못한 문제는 소요시간에 포함되지 않습니다.

Charlie의 팀은 단 하나의 문제만 해결했고, 정답은 HH:MM AM에 제출했습니다. 
다행히도 그들은 틀린 코드를 하나도 제출하지 않았습니다. 
Charlie의 팀이 해결한 문제의 소요시간을 계산하는 프로그램을 작성해주세요. 
TOPC는 오전 9시에 시작했다고 가정하면 됩니다.

### 입력
The input contains two space-separated integers HH and MM.

(해석)  
입력은 공백으로 구분된 두 정수 HH와 MM을 포함합니다.

### 출력
Output the time consumed for the only problem solved by Charlie’s team.

(해석)  
Charlie의 팀이 해결한 유일한 문제의 소요시간을 출력하세요.

### 제한
* 9 ≤ HH ≤ 11.
* 0 ≤ MM ≤ 59.


### 예제 입력 1
```
9 0
```

### 예제 출력 1
``` 
0
```

### 예제 입력 2
```
11 59
```

### 예제 출력 2
``` 
179
```

### 알고리즘 분류
* 수학
* 사칙연산
  
#

HH, MM 각각 scanf 로 입력받는다.
시작 기준시와 입력 받은 시간의 차이를 구한다.
출력은 분 단위로 이루어지므로 앞서 구한 시간을 분 단위로 변환한다.
변환한 시간값과 분을 더한다 -> 출력
