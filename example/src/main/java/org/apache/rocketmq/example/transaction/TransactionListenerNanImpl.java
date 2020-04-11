package org.apache.rocketmq.example.transaction;

import org.apache.rocketmq.client.producer.LocalTransactionState;
import org.apache.rocketmq.client.producer.TransactionListener;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by nanjunbo on 2018/8/12.
 */
public class TransactionListenerNanImpl implements TransactionListener {


    @Override
    public LocalTransactionState executeLocalTransaction(Message msg, Object arg) {

//        msg.getKeys();
       return LocalTransactionState.COMMIT_MESSAGE;
    }

    @Override
    public LocalTransactionState checkLocalTransaction(MessageExt msg) {

        return LocalTransactionState.COMMIT_MESSAGE;
    }
}
