package com.cs.socialmedia.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/rest/socialMedia")
public class SsmResource {


    /**
     * create new posts
     * @param userId : user Id of user
     * @param postId : Post id of content, posted by user
     * @param content : Content of the post.
     */
    @PostMapping(
            value = "/createPost",
            params = {"postId", "content"}
    )
    public void createPost(@RequestParam(value="userId") final String userId,
                           @RequestParam(value="postId") final String postId,
                           @RequestParam(value="content") final String content){

    }

    /**
     * Retrieve the 20 most recent post ids in the user's news feed.
     * Each item in the news feed must be posted either by one of the user’s followees or by the user herself.
     * Posts must be ordered by posting time starting from the most recent one.
     * @param userId :user Id to fetch post contents related to that user
     * @return
     */
    @GetMapping("/getNewsFeed/{userId}"    )
    public Map<String,String> getNewsFeed(@PathVariable("userId") final String userId){
        return null;
    }

    /**
     * Follower follows a followee.
     * @param followerId : user id of follower
     * @param followeeId : user id of folowee
     */
    @PutMapping("/follow/{followerId}/{followeeId}")
    public void followUser(@PathVariable final String followerId, @PathVariable final String followeeId){

    }

    /**
     * Follower unfollows a followee.
     * @param followerId : user id of follower
     * @param followeeId : user id of folowee
     */
    @PutMapping("/unfollow/{followerId}/{followeeId}")
    public void unfollowUser(@PathVariable final String followerId, @PathVariable final String followeeId){

    }

}
