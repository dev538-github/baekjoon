package Level06;

//ppublic class Test {
public class baekjoon_15596 {
    long sum(int[] a) {
        long ans = 0;
        for(int i  = 0; i < a.length; i++){
            ans += a[i];
        }
        return ans;
    }
}

//    정수 N개의 합 제출 언어 제한함수 구현
//        시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//        0.1 초	512 MB	8437	4438	3992	56.060%
//        문제
//        정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
//
//        작성해야 하는 함수는 다음과 같다.
//
//        C, C11, C (Clang), C11 (Clang): long long sum(int *a, int n);
//        a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
//        n: 합을 구해야 하는 정수의 개수
//        리턴값: a에 포함되어 있는 정수 n개의 합
//        C++, C++11, C++14, C++17, C++ (Clang), C++11 (Clang), C++14 (Clang), C++17 (Clang): long long sum(std::vector<int> &a);
//        a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
//        리턴값: a에 포함되어 있는 정수 n개의 합
//        Python 2, Python 3, PyPy, PyPy3: def solve(a: list) -> int
//        a: 합을 구해야 하는 정수 n개가 저장되어 있는 리스트 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
//        리턴값: a에 포함되어 있는 정수 n개의 합 (정수)
//        Java: long sum(int[] a); (클래스 이름: Test)
//        a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
//        리턴값: a에 포함되어 있는 정수 n개의 합
//        Go: sum(a []int) int
//        a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
//        리턴값: a에 포함되어 있는 정수 n개의 합
//        출처
//        문제를 만든 사람: baekjoon
//        제출할 수 있는 언어
//        C++14, Java, Python 3, C11, PyPy3, C, C++, C++11, C++17, Python 2, PyPy2, Go, C (Clang), C++ (Clang), C++11 (Clang), C++14 (Clang), C11 (Clang), C++17 (Clang)
//
//        채점
//        예제는 채점하지 않는다.
//        메모
//        메모 작성하기