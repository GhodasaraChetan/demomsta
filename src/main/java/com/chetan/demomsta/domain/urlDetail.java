package com.chetan.demomsta.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;

@Data
@Document(collection = "urlDetail")
public class urlDetail {

    @Id
    private String id;
    private String DateTime;
    private String EmailId;
    private String ReadingStatus; //(Done, Pending, Half, KeepChecking, Parent)
    private String Url;
    private String Note;
    private String Device; //(PC/Mobile/Other)
    private String Browser; //(Chrome/Firefox/Safari/other)
}
