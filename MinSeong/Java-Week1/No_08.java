����   B S
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	 
    out Ljava/io/PrintStream;  A상품의 가격을 입력하세요 (-1을 입력하면 종료): 
      java/io/PrintStream print (Ljava/lang/String;)V
     ! nextInt ()I #  프로그램을 종료합니다.
  % &  println ( +구매하려는 수량을 입력하세요: 
  * + , nextLine ()Ljava/lang/String;   . / 0 makeConcatWithConstants (I)Ljava/lang/String; 2 No_8 Code LineNumberTable LocalVariableTable this LNo_8; main ([Ljava/lang/String;)V price I quantity args [Ljava/lang/String; scanner Ljava/util/Scanner; StackMapTable 
SourceFile 	No_8.java BootstrapMethods F 총 비용: H
 I J K / L $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses O %java/lang/invoke/MethodHandles$Lookup Q java/lang/invoke/MethodHandles Lookup ! 1           3   /     *� �    4        5        6 7   	 8 9  3   �     L� Y� 	� L� � +� =� � "� $� &� '� +� >+� )W� h� -  � $��ñ    4   2    
         %  (  0  5  :  H  K  5   *   0 : ;  5  < ;    L = >    A ? @  A    �  � � "  B    C D     G  E M   
  N P R 