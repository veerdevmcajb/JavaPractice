package Io_Streams.ObjectStreams;

import java.io.Serializable;

public class ClassA implements Serializable {
    int a=10;
    transient int b=20;
}
