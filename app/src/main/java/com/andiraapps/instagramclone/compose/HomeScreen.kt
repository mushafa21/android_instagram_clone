package com.andiraapps.instagramclone.compose

import android.annotation.SuppressLint
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andiraapps.instagramclone.R
import com.andiraapps.instagramclone.model.Post
import com.andiraapps.instagramclone.model.Story
import com.andiraapps.instagramclone.ui.theme.InstagramCloneTheme
import com.andiraapps.instagramclone.ui.theme.bold12
import com.andiraapps.instagramclone.ui.theme.regular10
import com.andiraapps.instagramclone.ui.theme.regular12
import com.andiraapps.instagramclone.ui.theme.regular14
import com.andiraapps.instagramclone.ui.theme.sfUITextFamily


val postList: List<Post> = listOf(
    Post(
        username = "Ethan Rodriguez",
        avatar = R.drawable.img_avatar1,
        postImage = R.drawable.img_post1,
        caption = "Chasing sunsets and making memories that last a lifetime. ✨ #AdventureTime #SunsetMagic"
    ),
    Post(
        username = "Jackson Taylor",
        avatar = R.drawable.img_avatar2,
        postImage = R.drawable.img_post2,
        caption = "Embracing the simple joys in life—like coffee dates and good conversations. ☕️\uD83D\uDCAC #SimpleJoys #CoffeeLover"
    ),
    Post(
        username = "Ava Williams",
        avatar = R.drawable.img_avatar3,
        postImage = R.drawable.img_post3,
        caption = "Weekend vibes: where the only decision to make is poolside or beachfront? \uD83C\uDF34☀️ #WeekendGetaway #ChillMode"
    ),
    Post(
        username = "Maya Johnson",
        avatar = R.drawable.img_avatar4,
        postImage = R.drawable.img_post4,
        caption = "Finding beauty in the details and joy in the little things. \uD83C\uDF38 #DetailsMatter #JoyfulHeart"
    ),
    Post(
        username = "Olivia Smith",
        avatar = R.drawable.img_avatar5,
        postImage = R.drawable.img_post5,
        caption = "Embracing the simple joys in life—like coffee dates and good conversations. ☕️\uD83D\uDCAC #SimpleJoys #CoffeeLover"
    ),
)

val storyList: List<Story> = listOf(
    Story(username = "jackson", avatar = R.drawable.img_avatar2),
    Story(username = "ava_", avatar = R.drawable.img_avatar3),
    Story(username = "mayaa", avatar = R.drawable.img_avatar4),
    Story(username = "olivia_smth", avatar = R.drawable.img_avatar5),
    Story(username = "_adamm_", avatar = R.drawable.img_avatar6),
    Story(username = "david92", avatar = R.drawable.img_avatar7),
    Story(username = "kaya", avatar = R.drawable.img_avatar8),
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Image(
                        painter = painterResource(id = R.drawable.img_instagram_logo),
                        modifier = Modifier
                            .width(100.dp)
                            .height(30.dp),
                        contentDescription = null
                    )
                },
                actions = {
                    Image(
                        painter = painterResource(id = R.drawable.ic_add_post),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Image(
                        painter = painterResource(id = R.drawable.ic_heart),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Image(
                        painter = painterResource(id = R.drawable.ic_share),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.width(16.dp))


                }
            )
        },
        bottomBar = {

            BottomNavigation(
                backgroundColor = Color.White
            ) {
                BottomNavigationItem(selected = true, onClick = {}, icon = {
                    Image(
                        painter = painterResource(id = R.drawable.ic_navigation_home),
                        contentDescription = null
                    )
                })

                BottomNavigationItem(selected = false, onClick = {}, icon = {
                    Image(
                        painter = painterResource(id = R.drawable.ic_navigation_search),
                        contentDescription = null
                    )
                })

                BottomNavigationItem(selected = false, onClick = {}, icon = {
                    Image(
                        painter = painterResource(id = R.drawable.ic_navigation_reels),
                        contentDescription = null
                    )
                })


                BottomNavigationItem(selected = false, onClick = {}, icon = {
                    Image(
                        painter = painterResource(id = R.drawable.ic_navigation_shop),
                        contentDescription = null
                    )
                })

                BottomNavigationItem(selected = false, onClick = {}, icon = {
                    Image(
                        painter = painterResource(id = R.drawable.img_avatar1),
                        contentDescription = null,
                        modifier = Modifier
                            .clip(
                                CircleShape
                            )
                            .width(20.dp)
                            .height(20.dp),
                        contentScale = ContentScale.Crop
                    )
                })


            }
        }
    ) {


        LazyColumn(
            modifier = Modifier.padding(it),
        ) {
            item {
                LazyRow(modifier = Modifier.padding(horizontal = 8.dp)) {
                    item {
                        YourStoryView()

                    }
                    items(storyList) { story ->
                        StoryItem(story = story)
                    }
                }
            }
            items(postList) { post ->
                PostItem(post = post)
            }

        }


    }

}


@Composable
fun PostItem(post: Post) {
    Column(modifier = Modifier.padding(vertical = 10.dp)) {
        /// User Information
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = post.avatar),
                contentDescription = null,
                modifier = Modifier
                    .clip(
                        CircleShape
                    )
                    .width(30.dp)
                    .height(30.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(7.dp))

            Text(text = post.username, style = bold12, modifier = Modifier.weight(1f))

            Icon(imageVector = Icons.Default.MoreVert, contentDescription = null)


        }
        /// Image Post
        Image(
            painter = painterResource(id = post.postImage),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f),
            contentScale = ContentScale.Crop
        )

        /// Like, comment, share, bookmark
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(painter = painterResource(id = R.drawable.ic_heart), contentDescription = null)
            Spacer(modifier = Modifier.width(10.dp))
            Image(painter = painterResource(id = R.drawable.ic_comment), contentDescription = null)
            Spacer(modifier = Modifier.width(10.dp))
            Image(painter = painterResource(id = R.drawable.ic_share), contentDescription = null)
            Spacer(modifier = Modifier.weight(1f))
            Image(painter = painterResource(id = R.drawable.ic_bookmark), contentDescription = null)
        }

        /// Caption
        Text(
            modifier = Modifier.padding(8.dp),
            text = buildAnnotatedString {
                withStyle(
                    SpanStyle(
                        fontFamily = sfUITextFamily,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                ) {
                    append(post.username)
                }
                withStyle(
                    SpanStyle(
                        fontFamily = sfUITextFamily,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium
                    )
                ) {
                    append(" ")
                    append(post.caption)
                }
            })
    }
}


@Composable
fun YourStoryView() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier.size(70.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_avatar1), contentDescription = null,
                modifier = Modifier
                    .clip(
                        CircleShape
                    )
                    .size(70.dp),
                contentScale = ContentScale.Crop
            )
            Image(
                painter = painterResource(id = R.drawable.ic_add_story),
                contentDescription = null,
                modifier = Modifier
                    .size(20.dp)
                    .align(Alignment.BottomEnd)
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = "Your Story", style = regular12)
    }
}

@Composable
fun StoryItem(story: Story) {
    Column(
        modifier = Modifier.padding(start = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .clip(CircleShape)
                .size(70.dp)
                .background(
                    brush = Brush.verticalGradient(
                        listOf(
                            Color(0xff9E2692),
                            Color(0xffFAA958)
                        )
                    )
                )

        ) {
            Image(
                painter = painterResource(id = story.avatar), contentDescription = null,
                modifier = Modifier
                    .clip(
                        CircleShape
                    )
                    .size(66.dp)
                    .align(Alignment.Center)
                    .border(width = 2.dp, color = Color.White, shape = CircleShape),
                contentScale = ContentScale.Crop,
            )

        }

        Spacer(modifier = Modifier.height(4.dp))
        Text(text = story.username, style = regular12)
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    InstagramCloneTheme {
        HomeScreen()
    }
}


