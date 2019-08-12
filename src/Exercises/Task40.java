package Exercises;

public class Task40 {
    public static void main(String[] args) {
        int a = 7;
        int b = 14;
        int c = 21;
        int d = 41;
        if ( a > b ){
            if ( b > c ){
                if ( c > d ){
                    System.out.println( a +","+ b +","+ c +","+ d );
                } else {
                    if ( b > d ) {
                        System.out.println( a +","+ b +","+ d +","+ c );
                    } else {
                        if ( a > d ){
                            System.out.println( a +","+ d +","+ b +","+ c );
                        } else {
                            System.out.println( d +","+ a +","+ b +","+ c );
                        }
                    }
                }
            } else {
                if ( a > c ){
                    if ( b > d ) {
                        System.out.println( a +","+ c +","+ b +","+ d );
                    } else {
                        if (c > d) {
                            System.out.println(a + "," + c + "," + d + "," + b);
                        } else {
                            if (a > d) {
                                System.out.println(a + "," + d + "," + c + "," + b);
                            } else {
                                System.out.println(d + "," + a + "," + c + "," + b);
                            }
                        }
                    }
                } else {
                    if ( b > d ){
                        System.out.println( c +","+ a +","+ b +","+ d );
                    } else {
                        if ( a > d ){
                            System.out.println( c +","+ a +","+ d +","+ b );
                        } else {
                            if ( c > d ) {
                                System.out.println( c +","+ d +","+ a +","+ b );
                            } else {
                                System.out.println( d +","+ c +","+ a +","+ b );
                            }
                        }
                    }

                }
            }
        } else {
            if ( a > c ){
                if ( c > d ){
                    System.out.println( b +","+ a +","+ c +","+ d );
                } else {
                    if ( a > d ) {
                        System.out.println( b +","+ a +","+ d +","+ c );
                    } else {
                        if ( b > d ){
                            System.out.println( b +","+ d +","+ a +","+ c );
                        } else {
                            System.out.println( d +","+ b +","+ a +","+ c );
                        }
                    }
                }
            } else {
                if ( b > c ){
                    if ( a > d ){
                        System.out.println( b +","+ c +","+ a +","+ d );
                    } else {
                        if ( c > d ){
                            System.out.println( b +","+ c +","+ d +","+ a );
                        } else {
                            if ( b > d ){
                                System.out.println( b +","+ d +","+ c +","+ a );
                            } else {
                                System.out.println( d +","+ b +","+ c +","+ a );
                            }
                        }
                    }
                } else {
                    if ( a > d ){
                        System.out.println( c +","+ b +","+ a +","+ d );
                    } else {
                        if ( b > d ){
                            System.out.println( c +","+ b +","+ d +","+ a );
                        } else {
                            if ( c > d ) {
                                System.out.println( c +","+ d +","+ b +","+ a );
                            } else {
                                System.out.println( d +","+ c +","+ b +","+ a );
                            }
                        }
                    }
                }
            }

        }

    }

}
