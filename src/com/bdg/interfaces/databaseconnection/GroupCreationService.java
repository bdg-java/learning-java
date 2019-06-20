package com.bdg.interfaces.databaseconnection;

import com.bdg.interfaces.ConnectorProvider;
import com.bdg.interfaces.DatabaseConnector;
import com.bdg.interfaces.OracleConnector;

public class GroupCreationService {

    private DatabaseConnector connector = ConnectorProvider.getConnector();

    public Group createGroup(String groupName) {
        Group group = new Group(groupName);
        connector.save(group);
        return group;
    }
}
