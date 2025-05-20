## 26307. Everyone is a winner

### 문제
Your friend is a kindergarten teacher. Since the Olympic Games in Paris are approaching, he wants to teach the kids about different aspects of sports competitions. As part of this idea, he plans to have one day when kids receive medals for their behaviour in kindergarten. For example, he would give out a medal for the kid who shares their toys the most, or for the kid who encourages their playmates most creatively. To ensure kids are not offended at the end of the day, the teacher wants no kid to get fewer medals than another. The teacher tells you the number of medals he prepared and the number of kids, and he asks you to say whether it is possible to give out all of these medals to the kids so that they each get the same number of medals.

(해석)  

당신의 친구는 유치원 선생님입니다. 파리 올림픽이 다가오고 있어서, 그는 아이들에게 스포츠 경기의 다양한 측면을 가르치고 싶어합니다. 이 아이디어의 일환으로, 그는 아이들이 유치원에서의 행동에 대해 메달을 받는 하루를 계획하고 있습니다. 예를 들어, 장난감을 가장 많이 공유하는 아이나, 가장 창의적으로 친구들을 격려하는 아이에게 메달을 줄 것입니다. 하루가 끝날 때 아이들이 서운해하지 않도록, 선생님은 어떤 아이도 다른 아이보다 적은 수의 메달을 받지 않기를 원합니다. 선생님은 당신에게 준비한 메달의 수와 아이들의 수를 알려주며, 모든 메달을 아이들에게 똑같은 수로 나눠줄 수 있는지 말해달라고 부탁합니다.

### 입력
The input consists of one line. This line contains two space-separated integers 
$M$ and 
$K$: 
$M$ is the number of medals and 
$K$ is the number of kids.

(해석)  
입력은 한 줄로 구성됩니다. 이 줄은 공백으로 구분된 두 정수 $M$과 $K$를 포함합니다. $M$은 메달의 수이고 $K$는 아이들의 수입니다.

### 출력
The output should contain a single line, consisting of a word: the word Yes if it is possible to give out all 
$M$ medals to the 
$K$ kids so that each kid gets the same number of medals, or the word No otherwise.

(해석)  
출력은 한 줄이어야 하며, 하나의 단어로 구성됩니다 만약 $M$개의 메달을 $K$명의 아이들에게 모두 똑같은 수로 나눠줄 수 있다면 `Yes`라는 단어를, 그렇지 않다면 `No`라는 단어를 출력해야 합니다.

### 제한
* $1 \le M \le 1\, 000\, 000\, 000$ 
* $1 \le K \le 1\, 000\, 000\, 000$ 


### 예제 입력 1
```
6 3
```

### 예제 출력 1
``` 
Yes
```

### 예제 입력 2
```
5 3
```

### 예제 출력 2
``` 
No
```

### 알고리즘 분류
* 수학
* 사칙연산
  
#

scanf 로 값을 입력받아 메달수%아이들수 == 0 조건으로 Yes 또는 No 를 출력한다.
