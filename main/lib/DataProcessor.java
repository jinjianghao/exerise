package main.lib;

import java.util.ArrayList;
import java.util.List;

public class DataProcessor {
    private List<Data> cache;
    private int currentIndex;

    public DataProcessor() {
        cache = new ArrayList<>();
        currentIndex = 0;
    }

    public void processNextBatch() {
        if (currentIndex >= cache.size()) {
            // 从数据库中获取下一批数据
            List<Data> nextBatch = fetchDataFromDatabase();

            if (nextBatch.isEmpty()) {
                // 数据已经处理完毕
                return;
            }

            // 将新获取的数据添加到缓存中
            cache.addAll(nextBatch);
        }

        // 取出下一批数据进行处理
        List<Data> batch = cache.subList(currentIndex, Math.min(currentIndex + 50, cache.size()));

        // 处理数据
        for (Data data : batch) {
            // 处理逻辑
            // ...

            // 记录最后一条数据的ID到缓存中
            cacheLastProcessedDataId(data.getId());
        }

        currentIndex += 50;
    }

    private List<Data> fetchDataFromDatabase() {
        // 从数据库中查询ID升序排列的一千条数据
        // ...

        return new ArrayList<>(); // 返回查询结果
    }

    private void cacheLastProcessedDataId(int id) {
        // 将最后一条数据的ID记录到缓存中
        // ...
    }

    private static class Data {
        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}