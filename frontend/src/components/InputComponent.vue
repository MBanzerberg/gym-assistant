<template>
  <div class="input-box">
    <span class="icon"></span>
    <label>{{text}}</label>
    <input :type="type">
  </div>
</template>

<script>
export default {
  name: "InputComponent",
  props: ['text','type']
}
</script>

<style scoped>

.input-box {
  width: 80%;
  height: 8%;
  border-bottom: 2px solid;
  padding: 5%;
}

input {
  width: 100%;
  height: 100%;
  font-size: 16px;
  margin: 10%;
  background: transparent;
  border: none;
  outline: none;
  position: relative;
  bottom: 100%;
  color: white;
}

</style>
