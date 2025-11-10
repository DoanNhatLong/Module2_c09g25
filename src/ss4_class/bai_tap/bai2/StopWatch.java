package ss4_class.bai_tap.bai2;

import java.time.Duration;
import java.time.LocalDateTime;

public class StopWatch {
    private LocalDateTime startTime;
    private LocalDateTime  endTime;
    public StopWatch(){
        startTime=LocalDateTime.now();
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void start(){
        this.startTime=LocalDateTime.now();
    }

    public void end(){
        this.endTime=LocalDateTime.now();
    }

    public double getTime(){
        Duration duration=Duration.between(startTime,endTime);
        return duration.toSeconds();
    }

}
