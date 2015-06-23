package larssondesigns.com.stormy.weather;

/**
 * Created by Willy on 2015-06-16.
 */
public class Forecast {
    private Current mCurrent;
    private Hour[] mHourlyForeCast;
    private Day[] mDailyForecast;

    public Current getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Current current) {
        mCurrent = current;
    }

    public Hour[] getHourlyForeCast() {
        return mHourlyForeCast;
    }

    public void setHourlyForeCast(Hour[] hourlyForeCast) {
        mHourlyForeCast = hourlyForeCast;
    }

    public Day[] getDailyForecast() {
        return mDailyForecast;
    }

    public void setDailyForecast(Day[] dailyForecast) {
        mDailyForecast = dailyForecast;
    }
}
