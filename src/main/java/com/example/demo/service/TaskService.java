package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Task;

/**
 * タスク関連のサービスを提供するインターフェースです。
 */
public interface TaskService {
	
    /**
     * すべてのタスクを取得します。
     *
     * @return タスクのリスト
     */
	List<Task> findAll();

}