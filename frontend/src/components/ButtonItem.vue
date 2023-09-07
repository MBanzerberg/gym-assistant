<template>
  <div class="content">
    <button><span></span>{{text}}</button>
  </div>
</template>

<script>
export default {
  name: "ButtonItem",
  props: ['text']
}
</script>

<style scoped>

.content button {
  width: 200px;
  padding: 15px 0;
  text-align: center;
  margin: 10px 10px;
  border-radius: 25px;
  font-weight: bold;
  border: 2px solid #009688;
  background: transparent;
  color: #fff;
  cursor: pointer;
  position: relative;
  overflow: hidden;
}

.content span {
  background: #009688;
  height: 100%;
  width: 0;
  border-radius: 25px;
  position: absolute;
  left: 0;
  bottom: 0;
  z-index: -1;
  transition: 0.5s;
}

.content button:hover span {
  width: 100%;
}

.content button:hover {
  border: none;
}

</style>
