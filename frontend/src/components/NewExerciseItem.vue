<template>
  <div class="content">
    <div class="title">
      <h1>New Exercise</h1>
    </div>

    <div class="exercise-information">
      <input-component text="Name" type="text"/>
      <input-component text="Date" type="date"/>
      <input-component text="Sets" type="number"/>
      <input-component text="Reps" type="number"/>
    </div>

    <div class="description">
      <h2>Description</h2>
      <input type="text">
    </div>

    <div class="buttons">
      <button-component text="Submit"/>
      <button-component text="Cancel"/>
    </div>
  </div>
</template>

<script>
import InputComponent from "@/components/InputComponent";
import ButtonComponent from "@/components/InteractiveButtonComponent";
export default {
  name: "NewExerciseItem",
  components: {InputComponent, ButtonComponent}
}
</script>

<style scoped>
.content {
  width: 80%;
  height: 85%;
  position: absolute;
  left: 10%;
  top: 10%;
  border-radius: 20px;
  text-align: center;
  /*background-color: rebeccapurple;*/
  overflow: hidden;
  color: #fff;
  backdrop-filter: blur(40px);
  box-shadow: 0 0 30px rgba(0,0,0,.5);
}

.content .title {
  padding: 2%;
}

.content .exercise-information {
  width: 40%;
  height: 70%;
  /*background-color: aqua;*/
  position: relative;
  left: 3%;
  overflow: hidden;
}

.content .description {
  /*background-color: rgba(157,0,0,0.64);*/
  width: 50%;
  height: 70%;
  position: relative;
  bottom: 70%;
  left: 43%;
}

.content .description input {
  border-radius: 10px;
}

.content .description h2 {
  font-size: 20px;
  position: relative;
  top: 8%;
  right: 22%;
}

.content .description input {
  width: 70%;
  height: 50%;
  margin: 10%;
}

.content .buttons {
  width: 90%;
  height: 20%;
  /*background-color: rgba(23,157,0,0.64);*/
  position: relative;
  bottom: 80%;
  left: 7%;
}

.content .buttons button {
  position: relative;
  top: 20%;
  width: 20%;
  height: 50%;
  margin: 1%;
}
</style>
