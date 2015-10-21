class ForStudy{
  public static void main(String args[]){
    int counts[] = {1, 3, 5, 6, 5,2};
    int arrayLength = counts.length;

    for(int i = 0; i < arrayLength; i++){
      System.out.print(i + ":");

      for (int j = 0; j < counts[i]; j++){  // 配列の要素分繰り返す
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
