����   B \
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	 
    out Ljava/io/PrintStream;  ;이름을 입력하세요 (종료를 입력하면 종료): 
      java/io/PrintStream print (Ljava/lang/String;)V
     ! nextLine ()Ljava/lang/String; # 종료
 % & ' ( ) java/lang/String equals (Ljava/lang/Object;)Z +  프로그램을 종료합니다.
  - .  println 0 나이를 입력하세요: 
  2 3 4 nextInt ()I   6 7 8 makeConcatWithConstants '(Ljava/lang/String;I)Ljava/lang/String; : No_7 Code LineNumberTable LocalVariableTable this LNo_7; main ([Ljava/lang/String;)V name Ljava/lang/String; age I args [Ljava/lang/String; scanner Ljava/util/Scanner; StackMapTable 
SourceFile 	No_7.java BootstrapMethods O 입력한 이름: , 나이:  Q
 R S T 7 U $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses X %java/lang/invoke/MethodHandles$Lookup Z java/lang/invoke/MethodHandles Lookup ! 9           ;   /     *� �    <        =        > ?   	 @ A  ;   �     O� Y� 	� L� � +� M,"� $� � *� ,� %� /� +� 1>+� W� ,� 5  � ,����    <   2    	       !  )  ,  4  9  >  K  N  =   *   3 B C  9  D E    O F G    D H I  J    �  �   %� !  K    L M     P  N V   
  W Y [ 