package com.indx.todolist.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "todos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoItem {
    @Id
    @SequenceGenerator(name="todos_id_seq",
            sequenceName="todos_id_seq",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="todos_id_seq")
    @NonNull
    Long id;
    @NonNull
    String item;
}
