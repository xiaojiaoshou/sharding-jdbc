package com.example.myshardingjdbc.config;


/**
 * <p></p>
 * Created by @author zhezhiyong@163.com on 2018/12/25.
 */
//@Configuration
public class DataSourceConfig {

//    public DataSource getDataSource() throws SQLException {
//        ShardingRuleConfiguration shardingRuleConfig = new ShardingRuleConfiguration();
//        shardingRuleConfig.getTableRuleConfigs().add(getOrderTableRuleConfiguration());
//        shardingRuleConfig.getTableRuleConfigs().add(getOrderItemTableRuleConfiguration());
//        shardingRuleConfig.getBindingTableGroups().add("t_order, t_order_item");
//        shardingRuleConfig.setDefaultTableShardingStrategyConfig(new StandardShardingStrategyConfiguration("order_id", new PreciseModuloShardingTableAlgorithm()));
//        return createDataSource(createDataSourceMap(), shardingRuleConfig, new HashMap<String, Object>(), new Properties(), orchestrationConfig);
//    }
//
//    private TableRuleConfiguration getOrderTableRuleConfiguration() {
//        TableRuleConfiguration result = new TableRuleConfiguration();
//        result.setLogicTable("t_order");
//        result.setActualDataNodes("demo_ds.t_order_${[0, 1]}");
//        result.setKeyGeneratorColumnName("order_id");
//        return result;
//    }
//
//    private TableRuleConfiguration getOrderItemTableRuleConfiguration() {
//        TableRuleConfiguration result = new TableRuleConfiguration();
//        result.setLogicTable("t_order_item");
//        result.setActualDataNodes("demo_ds.t_order_item_${[0, 1]}");
//        return result;
//    }
//
//    private Map<String, DataSource> createDataSourceMap() {
//        Map<String, DataSource> result = new HashMap<>();
//        result.put("demo_ds", DataSourceUtil.createDataSource("demo_ds"));
//        return result;
//    }


}
