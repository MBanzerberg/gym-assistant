<template>
  <div>
    <div class="main-container">
      <div class="navbar">
        <div class="dumbbell-icon"></div>
        <ul>
          <li><a href="#">Home</a></li>
          <li><a href="#">About Us</a></li>
        </ul>
      </div>
      <div class="content">
        <main-menu-item/>
      </div>
    </div>
  </div>
</template>

<script>
import MainMenuItem from "@/components/MainMenuItem";
//import NewExerciseItem from "@/components/NewExerciseItem";

export default {
  components: {MainMenuItem}
}
</script>

<style>
* {
  margin: 0;
  padding: 0;
  font-family: sans-serif;
}

.dumbbell-icon {
  width: 40px;
  height: 40px;
  background-image: linear-gradient(rgba(0,0,0,0.75),rgba(0,0,0,0.75)),url("assets/dumbbell_icon.png");
  background-size: 40px;
  background-position: left;
}

.main-container {
  width: 100%;
  height: 100vh;
  background-image: linear-gradient(rgba(0,0,0,0.75),rgba(0,0,0,0.75)),url("assets/gym.jpg");
  background-size: cover;
  background-position: center;
}

.navbar {
  width: 85%;
  margin: auto;
  padding: 35px 0;
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.navbar ul li {
  list-style: none;
  display: inline-block;
  margin: 0 20px;
  position: relative;
}

.navbar ul li a {
  text-decoration: none;
  color: #fff;
  text-transform: uppercase;
}

.navbar ul li::after {
  content: '';
  height: 3px;
  width: 0;
  background: #009688;
  position: absolute;
  left: 0;
  bottom: -10px;
  transition: 0.5s;
}

.navbar ul li:hover::after {
  width: 100%;
}

.content {
  /*background-color: red;*/
  width: 50%;
  height: 65%;
  position: absolute;
  left: 22%;
  top: 20%;

}

</style>
