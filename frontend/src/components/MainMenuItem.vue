<template>
  <div class="content">
    <h1>Gym Assistant</h1>
    <div class="buttons">
      <button-component text="New Exercise"/>
      <button-component text="New Data"/>
    </div>
  </div>
</template>

<script>
import ButtonComponent from "@/components/InteractiveButtonComponent";
export default {
  components: {ButtonComponent},
  name: "MainMenuItem"
}
</script>

<style scoped>
.content {
  width: 80%;
  height: 50%;
  position: relative;
  top: 50%;
  left: 10%;
  transform: translateY(-50%);
  text-align: center;
  color: #fff;
  /*background-color: red;*/
}

.content .buttons {
  margin: 20px 20px;
}

.content h1 {
  font-size: 450%;
  margin-top: 10%;
}
</style>
