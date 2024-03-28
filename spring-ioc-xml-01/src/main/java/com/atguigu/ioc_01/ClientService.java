package com.atguigu.ioc_01;

/**
 * @ClassName: ClientService
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 15:31 2024/03/28
 * @Modified By: bin.zhao
 * @Modify Time: 15:31 2024/03/28
 * @Version: 1.0
 */

public class ClientService {
    private static ClientService clientService = new ClientService();
    private ClientService() {}

    public static ClientService createInstance() {

        return clientService;
    }
}