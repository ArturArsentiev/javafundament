package com.softserve.edu06.pt;

public class Line {
    private Point start;
    private Point end;

    public Line (int x0, int y0, int x1, int y1) {
        this(new Point(x0, y0), new Point(x1, y1));
    }

    public Line (Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart () {
        return start;
    }

    public void setStart (Point start) {
        this.start = start;
    }

    public Point getEnd () {
        return end;
    }

    public void setEnd (Point end) {
        this.end = end;
    }

    @Override
    public String toString () {
        return "Line from " + start +
                " to " + end;
    }

    public void print () {
        System.out.println(this);
    }
}
