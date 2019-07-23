package com.epam.entity;

import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
//@AllArgsConstructor
@ToString
public class XArgsConstructor {
    @NonNull private String name;
    @NonNull private Integer age;

}
