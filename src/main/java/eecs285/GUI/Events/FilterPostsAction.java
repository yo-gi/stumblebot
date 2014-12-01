package eecs285.GUI.Events;

import com.tumblr.jumblr.types.Post;
import eecs285.App;
import eecs285.GUI.TumblrReblogGUI;
import eecs285.Reblog.Reblog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FilterPostsAction implements ActionListener
{
  private static List<Post> filteredPosts = new ArrayList<Post>();

  public void actionPerformed(ActionEvent actionEvent)
  {
    TumblrReblogGUI.getRestoreButton().setEnabled(true);
    TumblrReblogGUI.getPostButton().setEnabled(true);
    App.globalPostsPreFilter = App.globalPosts;

    @SuppressWarnings("unused")
    Reblog action = new Reblog();
    action.ReblogAll();



    /* Reblog Test

    Post test = filteredPosts.get(5);

    test.reblog("delicatedragonstarlight.tumblr.com");
    String reblogKey = test.getReblogKey();
    long postId = test.getId();

    //Blog b = App.client.blogInfo("delicatedragonstarlight");
    //List<Post> posts = App.client.blogPosts("delicatedragonstarlight");

    //System.out.println(posts.get(0));
    //posts.get(0).reblog("delicatedragonstarlight.tumblr.com");


    //Post rebloggedPost = App.client.postReblog("delicatedragonstarlight.tumblr.com", postId, reblogKey);
    */
  }
}
